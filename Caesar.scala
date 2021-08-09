object Caesar {
  def main(args: Array[String]): Unit = {
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"

    //input text
    val inputText = scala.io.StdIn.readLine("Secret Message: ")

    val E = (c: Char, key: Int, a: String) => a((a.indexOf(c.toUpper) + key) % a.size)

    val D = (c: Char, key: Int, s: String) => s((s.indexOf(c.toUpper) - key) % s.size)

    val cipher = (algo: (Char, Int, String) => Char, s: String, key: Int, a: String) => s.map(algo(_, key, a))

    //Output encrypted or decrypted
    //shift in 2
    val ct = cipher(E, inputText, 2, alphabet)
    val dt = cipher(D, inputText, 2, alphabet)
    println("Encrypted: " + ct)
    println("Decrypted: " + dt)

  }

}
