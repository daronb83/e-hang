
public class Main {
  /**
   * Plays a game of Hangman where the computer cheats
   *
   * @param args [0-x]dictionary with whitespace, [x + 1]wordLength, [x + 2]guesses
   */
  public static void main (String[] args) {
    int wordLength = 0;
    int guesses = 0;
    String filePath = "";
    File dictionary = null;

    try {
      for (int i = 0; i < args.length - 2; i++){
        filePath += args[i];
      }
      dictionary = new File(filePath);
      wordLength = Integer.parseInt(args[args.lenth - 2]);
      guesses = Integer.parseInt(args[args.lenth - 1]);
      if (wordLength < 2 || guesses < 1) {
        uException();
      }
    }
    catch (NumberFormageException | IndexOutOfBoundsException  e) {
      uException();
    }

    EvilHangman hang = new EvilHangman();
    hang.startGame(dictionary, wordLength);
    gameLoop(hang, guesses);

  }

  public static void uException() {
    System.out.println("Usage: java hangman.Main dictionary wordLength guesses");
    System.exit(0);
  }

  gameLoop(EvilHangman hang, guesses) {

    while (guesses > 0) {
      guess--;
    }
  }
}
