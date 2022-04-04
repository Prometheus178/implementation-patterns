package ctructure.adapter;

import ctructure.adapter.adapters.SquarePegAdapter;
import ctructure.adapter.round.RoundHole;
import ctructure.adapter.round.RoundPeg;
import ctructure.adapter.square.SquarePeg;

public class Demo {

    public static void main(String[] args) {

        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);

        SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSquarePegAdapter = new SquarePegAdapter(largeSqPeg);

        if (hole.fits(smallSquarePegAdapter)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }
        if (!hole.fits(largeSquarePegAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }

    }
}
