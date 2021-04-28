/**
 * generated by Xtext 2.24.0
 */
package org.example.entities.validation;

import java.util.HashSet;
import org.eclipse.xtext.validation.Check;
import org.example.entities.entities.Attribute;
import org.example.entities.entities.EntitiesPackage;
import org.example.entities.entities.Entity;
import org.example.entities.validation.AbstractEntitiesValidator;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class EntitiesValidator extends AbstractEntitiesValidator {
  protected static final String ISSUE_CODE_PREFIX = "org.example.entities.";
  
  public static final String HIERACHY_CYCLE = (EntitiesValidator.ISSUE_CODE_PREFIX + "HierarchyCycle");
  
  public static final String INVALID_ENTITY_NAME = (EntitiesValidator.ISSUE_CODE_PREFIX + "invalidEntityName");
  
  public static final String INVALID_ATTRIBUTE_NAME = (EntitiesValidator.ISSUE_CODE_PREFIX + "InvalidAttributeName");
  
  @Check
  public void checkNoCycleInEntityHieararchy(final Entity entity) {
    Entity _suprtType = entity.getSuprtType();
    boolean _tripleEquals = (_suprtType == null);
    if (_tripleEquals) {
      return;
    }
    final HashSet<Entity> visitedEntities = new HashSet<Entity>();
    Entity current = entity.getSuprtType();
    while ((current != null)) {
      {
        boolean _contains = visitedEntities.contains(current);
        if (_contains) {
          String _name = current.getName();
          String _plus = ("Cycle in hierarchy of entity \'" + _name);
          String _plus_1 = (_plus + "\'");
          this.error(_plus_1, 
            EntitiesPackage.eINSTANCE.getEntity_SuprtType(), 
            EntitiesValidator.HIERACHY_CYCLE, 
            current.getSuprtType().getName());
          return;
        }
        visitedEntities.add(current);
        current = current.getSuprtType();
      }
    }
  }
  
  @Check
  public void checkEntityNameStartsWithCapital(final Entity entity) {
    boolean _isLowerCase = Character.isLowerCase(entity.getName().charAt(0));
    if (_isLowerCase) {
      this.warning("Entity name should start with a capital", 
        EntitiesPackage.eINSTANCE.getEntity_Name(), 
        EntitiesValidator.INVALID_ENTITY_NAME, 
        entity.getName());
    }
  }
  
  @Check
  public void checkAttributeNameStartsWithLowercase(final Attribute attr) {
    boolean _isUpperCase = Character.isUpperCase(attr.getName().charAt(0));
    if (_isUpperCase) {
      this.warning("Attribute name should start with a lowercase", 
        EntitiesPackage.eINSTANCE.getAttribute_Name(), 
        EntitiesValidator.INVALID_ATTRIBUTE_NAME, 
        attr.getName());
    }
  }
}
