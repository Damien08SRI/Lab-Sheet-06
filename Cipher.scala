package Demo6

object Cipher {

  def cipher(text: String, shift: Int, action: String): String = {
    action match {
      case "encrypt" => CaesarCipher.caesarEncrypt(text, shift)
      case "decrypt" => CaesarCipher.caesarDecrypt(text, shift)
      case _ => throw new IllegalArgumentException("Action must be 'encrypt' or 'decrypt'")
    }
  }

}
