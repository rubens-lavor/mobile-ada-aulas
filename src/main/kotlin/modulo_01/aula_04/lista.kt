package modulo_01.aula_04

fun exemplosLista() {
    val list: List<String> = listOf("str1", "str2", "str3")

    val tupla: List<Any> = listOf(1,"",true,1.0)

    val arrayList: ArrayList<String> = arrayListOf("s", "swd")
    arrayList[0] = "outro"

    val mutableList = mutableListOf("s", "swd")
    mutableList[0] = "outro"

    println(list.indices)
    println(tupla)
}