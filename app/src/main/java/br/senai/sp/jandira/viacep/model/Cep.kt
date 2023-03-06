package br.senai.sp.jandira.viacep.model

import com.google.gson.annotations.SerializedName

data class Cep(
    // os nomes dos atributos devem ser os mesmos do Json da API
    var cep: String,
    var logradouro: String,
    var complemento: String,
    var bairro: String,
    // caso o nome do objeto for diferente, é necessáro fazer uma anotação para o Gson entender
    @SerializedName("localidade") var cidade: String,
    @SerializedName("uf") var estado: String
)
