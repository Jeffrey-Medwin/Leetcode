import java.util.ArrayList;
import java.util.List;

public class SnakeInMatrix {
    int x;
    int y;
    public int positionOfSnake(int n, List<String> commands) {

        x = y = 0;
        if ((n == 0) || (n == 1)) {
            return n;
        }

        /*
         * In programming,
         *  i represents y axis
         *  j represents x axis
         */
        commands.stream().forEach(command -> {
            
            if ((x < n) || (y < n)) {
                switch (command.toUpperCase()) {
                    case "RIGHT":
                        y += 1;
                        break;
                
                    case "LEFT":
                        y -= 1;
                        break;

                    case "UP":
                        x -= 1;
                        break;

                    case "DOWN":
                        x += 1;
                        break;

                    default:
                        break;
                }
            }
        });

        return (x * n) + y;
    }

    public static void main(String[] args) {
        SnakeInMatrix matrix = new SnakeInMatrix();
        List<String> commands = new ArrayList<>();
        commands.add("DOWN");
        commands.add("RIGHT");
        commands.add("UP");
        System.out.println(matrix.positionOfSnake(3, commands));
    }
}
