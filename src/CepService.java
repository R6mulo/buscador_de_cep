import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CepService {

    public Endereco buscarEndereco(String cep) {
        String url = "https://viacep.com.br/ws/" + cep + "/json/";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();

            if (json.contains("\"erro\": true")) {
                System.out.println("CEP não encontrado!");
                return null;
            }

            Gson gson = new Gson();
            return gson.fromJson(json, Endereco.class);

        } catch (IOException | InterruptedException e) {
            System.out.println("Erro ao consultar o CEP: " + e.getMessage());
            return null;
        }
    }
}
