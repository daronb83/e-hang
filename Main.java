
public class Main {
  /**
   * Plays a game of Hangman where the computer cheats
   *
   * @param args [0-x]dictionary with whitespace, [x + 1]wordLength, [x + 2]guesses
   */
  public static void main (String[] args) {
    int wordLength, guesses;
    File dictionary;

    try {
      dictionary = new File(args[0]);
      wordLength = Integer.parseInt(args[1]);
      guesses = Integer.parseInt(args[2]);
    }
    catch (NumberFormageException | IndexOutOfBoundsException  e) {
      System.out.println("Usage: java EvilHangman dictionary wordLength guesses");
      System.exit(0);
    }

    if (wordLength < 2 || )

    startGame(dictionary, wordLength);

  }

  gameLoop(dictionary, wordLength, guesses) {

  }
}
