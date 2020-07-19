package com.example.myfirstsdk;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.DataInput;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/**
 * HTTP通信でJSONを取得し、パース処理するクラス。
 *
 * @author Kazuki Itoh
 * @since 1.0
 */
public class MainActivity {
    public JsonDto getJSON() throws IOException {
        String url = "https://jsonplaceholder.typicode.com/posts/1";
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder().url(url).build();
        Call call = client.newCall(request);
        Response response = call.execute();
        ResponseBody body = response.body();

        ObjectMapper mapper = new ObjectMapper();
        JsonDto jsonDto = mapper.readValue((DataInput) body, JsonDto.class);

        return jsonDto;
    }
}
