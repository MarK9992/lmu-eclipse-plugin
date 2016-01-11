package org.lucci.lmu.input;

import org.lucci.lmu.model.IModel;

/**
 * @author Marc Karassev
 */
public abstract class ModelBuilder {

    // Methods

    protected abstract IModel createModel(byte[] data) throws ParseError, ModelException;
}