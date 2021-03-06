package utils

object PasswdGen {
  private val allowedChars = (('0' to '9') ++
    ('A' to 'Z') ++ ('a' to 'z')).toArray ++
    Array('-', '.', '_')
  private val allowedCharsLength = allowedChars.length

  private def nextChar(): Char = {
    allowedChars(util.Random.nextInt(allowedCharsLength))
  }

  def nextPasswd(passwdLen: Int): String = {
    val passwd = new StringBuilder(passwdLen)
    for (i <- 0 to passwdLen) passwd += nextChar
    passwd.toString
  }
}
