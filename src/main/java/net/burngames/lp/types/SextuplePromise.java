package net.burngames.lp.types;

import net.burngames.lp.types.tasks.SextupleTask;

/**
 * Represents a Promise that requires 6 arguments
 *
 * @author PaulBGD
 */
public class SextuplePromise<A, B, C, D, E, F> implements PromiseInterface {

    private final SextupleTask<A, B, C, D, E, F> task;

    public SextuplePromise(SextupleTask<A, B, C, D, E, F> task) {
        this.task = task;
    }

    public Object complete(Object... arguments) {
        if (arguments.length != 6) {
            throw new IllegalArgumentException("There must be 6 arguments");
        }
        return this.task.task((A) arguments[0], (B) arguments[1], (C) arguments[2], (D) arguments[3], (E) arguments[4], (F) arguments[5]);
    }

}
