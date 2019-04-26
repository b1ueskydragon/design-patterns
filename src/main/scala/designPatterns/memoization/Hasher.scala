package designPatterns.memoization

import java.security.MessageDigest

import org.apache.commons.codec.binary.Hex

class Hasher extends Memoizer {

  val mem: String => String = memo {
    md5
  }

  def md5(input: String): String = {
    println(s"""input is $input""")

    new String(
      Hex.encodeHex(
        MessageDigest.getInstance("MD5").digest(input.getBytes)
      )
    )
  }

}
