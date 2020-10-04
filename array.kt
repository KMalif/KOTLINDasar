fun main() {
    //array
    val anggota: Array<String> = arrayOf(" I", " YOU", " WE", " THEY", " he", " she", " she")
    for (member in anggota) {
        if (member != " she") {
            println("kata ganti : $member")
        }
    }
}
