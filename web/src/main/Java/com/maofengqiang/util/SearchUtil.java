package com.maofengqiang.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.update.UpdateRequest;
import org.elasticsearch.action.update.UpdateResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.common.xcontent.XContentFactory;
import org.elasticsearch.transport.client.PreBuiltTransportClient;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;


public class SearchUtil {

    private static TransportClient client;

    public static TransportClient getClient() {
        if(client!=null){
            return client;
        }
        try {
            Settings settings = Settings.builder().put("cluster.name", "elasticsearch")// 设置集群名
                    .put("client.transport.sniff", true).build();// 开启嗅探
            client = new PreBuiltTransportClient(settings)
                    //  .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("192.168.227.128"), 9302))
                    .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("192.168.227.128"), 9300));
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return client;
    }

    public static Map searchById(String index,String type,String id){
        GetResponse response = getClient().prepareGet(index,type,id).execute().actionGet();
        Map<String, Object> map = response.getSource();
        return map;
    }

    public static Map searchBy(String index,String type,String id){
        GetResponse response = getClient().prepareGet(index,type,id).execute().actionGet();
        Map<String, Object> map = response.getSource();
        return map;
    }


    public static void delete(String index,String type,String id) {
        DeleteResponse response = getClient().prepareDelete(index, type, id).get();
/*        String index = response.getIndex();
        String type = response.getType();
        String id = response.getId();
        long version = response.getVersion();
        System.out.println(index + " : " + type + ": " + id + ": " + version);*/
    }

    public static void updateById(String index,String type,String id,Map map){
/*        UpdateRequest updateRequest = new UpdateRequest().index(index).type(type).id(id).doc(map);
        UpdateResponse response = this.getClient().update(updateRequest).get();*/
        UpdateResponse response = getClient().prepareUpdate(index,type,id).setDoc(map).get();
    }

    public static void indexByMap(String index,String type,String id,Map map){
        IndexResponse response = getClient().prepareIndex(index, type,id).setSource(map).get();
    }

/*    public static void indexByJson(String index,String type,String json) throws Exception {
        JSONObject jsonObject = JSON.parseObject(json);
        IndexResponse response = getClient().prepareIndex(index, type,id).setSource(map).get();
    }*/

}
