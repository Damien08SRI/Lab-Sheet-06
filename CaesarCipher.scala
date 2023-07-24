package Demo6

object CaesarCipher {
  def caesarEncrypt(plaintext: String, shift: Int): String = {
    plaintext.map { char =>
      if (char.isLetter) {
        val isUpper = char.isUpper
        val charOffset = if (isUpper) 'A' else 'a'
        val shiftedChar = ((char - charOffset + shift) % 26 + charOffset).toChar
        if (isUpper) shiftedChar else shiftedChar.toLower
      } else {
        char
      }
    }.mkString
  }

  def caesarDecrypt(ciphertext: String, shift: Int): String = {
    caesarEncrypt(ciphertext, -shift)
  }


}
