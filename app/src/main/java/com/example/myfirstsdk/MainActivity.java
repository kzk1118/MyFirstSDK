package com.example.myfirstsdk;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * HTTP通信でJSONを取得し、パース処理するクラス。
 *
 * @author Kazuki Itoh
 * @since 1.0
 */
public class MainActivity {
    public JsonDto getJSON() throws IOException {

        // エンドポイント
        String url = "https://jsonplaceholder.typicode.com/posts/1";

        // HTTP通信でJSONを取得
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .get()
                .url(url)
                .build();
        Call call = client.newCall(request);
        Response response = call.execute();
        String json = response.body().string();

        // パース処理
        ObjectMapper mapper = new ObjectMapper();
        JsonDto jsonDto = mapper.readValue(json, JsonDto.class);

        // DTOオブジェクトを返す
        return jsonDto;
    }
}
