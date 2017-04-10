package crypt.api.annotation;


/**
 * Instances of objects that implements ParserAnnotation can parse object with CryptAnnotation. 
 * @author Radoua Abderrahim
 * 
 * @param <Entity> Type of Entity (object). 
 */
public interface ParserAnnotation<Entity> {
	
	/**
	 * this method perform some actions on Entity like Crypt, Hash, Sign ... actions, and return the Entity itself.
	 * @param actions : Enumeration of ParserAction to specify witch action can be performed on Entity, it can be an array of actions.
	 * @return Entity : return the same object passed in Parser constructor  
	 */
	public Entity parseAnnotation(ParserAction ...actions);
	
	}