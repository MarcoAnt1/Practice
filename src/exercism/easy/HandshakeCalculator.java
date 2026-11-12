package exercism.easy;

import exercism.easy.help.Signal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HandshakeCalculator {
    public List<Signal> calculateHandshake(int number) {
        var signals = new ArrayList<Signal>();
        var count = 0;

        while (number > 0) {
            if ((number & 1) != 1) {
                number >>= 1;
                count++;
                continue;
            }

            switch (count) {
                case 0:
                    signals.add(Signal.WINK);
                    break;
                case 1:
                    signals.add(Signal.DOUBLE_BLINK);
                    break;
                case 2:
                    signals.add(Signal.CLOSE_YOUR_EYES);
                    break;
                case 3:
                    signals.add(Signal.JUMP);
                    break;
                case 4:
                    Collections.reverse(signals);
                    break;
            }

            number >>= 1;
            count++;
        }

        return signals;
    }

    public List<Signal> calculateHandshake_v1(int number) {
        IntPredicate isBitOn = bitIndex -> ((1 << bitIndex) & number) > 0;

        List <Signal> signals = IntStream.range(0, Signal.values().length)
                .filter(isBitOn)
                .mapToObj(i -> Signal.values()[i])
                .collect(Collectors.toList());

        if (isBitOn.test(Signal.values().length)) {
            Collections.reverse(signals);
        }

        return signals;
    }

    public List<Signal> calculateHandshake_v2(int number) {
        final var output = new Vector<Signal>();
        int action = 0;
        int action_incr = 1;
        int end = Signal.values().length;

        if ((number & 16) != 0) {
            action = 3;
            action_incr = -1;
            end = -1;
        }

        for(; action != end; action += action_incr) {
            if ((number & (1 << action)) != 0) {
                output.add(Signal.values()[action]);
            }
        }

        return output;
    }

    public List<Signal> calculateHandshake_v3(int number) {
        var signals = new ArrayList<Signal>();

        if ((number & 1) != 0)
            signals.add(Signal.WINK);

        if ((number & 2) != 0)
            signals.add(Signal.DOUBLE_BLINK);

        if ((number & 4) != 0)
            signals.add(Signal.CLOSE_YOUR_EYES);

        if ((number & 8) != 0)
            signals.add(Signal.JUMP);

        if ((number & 16) != 0)
            Collections.reverse(signals);

        return signals;
    }
}
