package org.example;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

// responsavel por consultar o servidor remoto e pegar os dados dos atendimentos
public class PreencheAtendimentos {

        ServidorRemoto servidorRemoto;

        public PreencheAtendimentos( ServidorRemoto servidorRemoto){
            this.servidorRemoto = servidorRemoto;
        }


        public Horario buscaHorarios(String nome){

                String horarioJson = servidorRemoto.buscaAtendimento(nome);

                JsonObject jsonObject = JsonParser.parseString(horarioJson).getAsJsonObject();

                return new Horario(jsonObject.get("nomeDoProfessor").getAsString(),
                        jsonObject.get("horarioDeAtendimento").getAsString(),
                        jsonObject.get("periodo").getAsString(),
                        jsonObject.get("sala").getAsInt(),
                        jsonObject.get("predio").getAsString());
        }

}
