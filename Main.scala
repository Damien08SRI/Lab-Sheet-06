package Demo6

object Main extends App{
  val plaintext = "Hello, Caesar Cipher!"
  val shiftValue = 3

  val encryptedText = Cipher.cipher(plaintext, shiftValue, "encrypt")
  println(s"Encrypted: $encryptedText")

  val decryptedText = Cipher.cipher(encryptedText, shiftValue, "decrypt")
  println(s"Decrypted: $decryptedText")

}
