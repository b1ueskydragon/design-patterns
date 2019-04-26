package designPatterns.memoization

import java.security.MessageDigest

import com.typesafe.scalalogging.StrictLogging
import org.apache.commons.codec.binary.Hex

class Hasher extends Memoizer with StrictLogging {

  val mem: String => String = memo {
    md5
  }

  def md5(input: String): String = {
    logger.debug(s"""input is $input""")

    new String(
      Hex.encodeHex(
        MessageDigest.getInstance("MD5").digest(input.getBytes)
      )
    )
  }

}
