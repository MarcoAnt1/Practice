package exercism.easy;

public class RaindropConverter {
    public String convert(int number) {
        var response = new StringBuilder();

        if (number % 3 == 0) {
            response.append("Pling");
        }

        if (number % 5 == 0) {
            response.append("Plang");
        }

        if (number % 7 == 0) {
            response.append("Plong");
        }

        if (response.isEmpty()) {
            response.append(number);
        }

        return response.toString();
    }
}
