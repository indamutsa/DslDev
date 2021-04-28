/**
 * generated by Xtext 2.9.1
 */
package org.example.entities.tests;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.util.ReflectExtensions;
import org.eclipse.xtext.xbase.testing.CompilationTestHelper;
import org.eclipse.xtext.xbase.testing.TemporaryFolder;
import org.example.entities.tests.EntitiesInjectorProvider;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(EntitiesInjectorProvider.class)
@SuppressWarnings("all")
public class EntitiesGeneratorTest {
  @Rule
  @Inject
  public TemporaryFolder temporaryFolder;
  
  @Inject
  @Extension
  private CompilationTestHelper _compilationTestHelper;
  
  @Inject
  @Extension
  private ReflectExtensions _reflectExtensions;
  
  @Test
  public void testGeneratedCode() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("entity MyEntity {");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("string myAttribute;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("package entities;");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("public class MyEntity {");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("private String myAttribute;");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("public String getMyAttribute() {");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("return myAttribute;");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("public void setMyAttribute(String _arg) {");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("this.myAttribute = _arg;");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      this._compilationTestHelper.assertCompilesTo(_builder, _builder_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testGeneratedJavaCodeIsValid() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("entity MyEntity {");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("string myAttribute;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final IAcceptor<CompilationTestHelper.Result> _function = (CompilationTestHelper.Result it) -> {
        it.getCompiledClass();
      };
      this._compilationTestHelper.compile(_builder, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testGeneratedJavaCode() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("entity E {");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("string myAttribute;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final IAcceptor<CompilationTestHelper.Result> _function = (CompilationTestHelper.Result it) -> {
        try {
          Object _newInstance = it.getCompiledClass().newInstance();
          final Procedure1<Object> _function_1 = (Object it_1) -> {
            try {
              Assert.assertNull(this._reflectExtensions.invoke(it_1, "getMyAttribute"));
              this._reflectExtensions.invoke(it_1, "setMyAttribute", "value");
              Assert.assertEquals("value", this._reflectExtensions.invoke(it_1, "getMyAttribute"));
            } catch (Throwable _e) {
              throw Exceptions.sneakyThrow(_e);
            }
          };
          ObjectExtensions.<Object>operator_doubleArrow(_newInstance, _function_1);
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      };
      this._compilationTestHelper.compile(_builder, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testGeneratedCodeWithTwoEntites() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("entity FirstEntity {");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("SecondEntity myAttribute;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("entity SecondEntity { }");
      _builder.newLine();
      final IAcceptor<CompilationTestHelper.Result> _function = (CompilationTestHelper.Result it) -> {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("package entities;");
        _builder_1.newLine();
        _builder_1.newLine();
        _builder_1.append("public class FirstEntity {");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("private SecondEntity myAttribute;");
        _builder_1.newLine();
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("public SecondEntity getMyAttribute() {");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("return myAttribute;");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("}");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("public void setMyAttribute(SecondEntity _arg) {");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("this.myAttribute = _arg;");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("}");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.newLine();
        _builder_1.append("}");
        _builder_1.newLine();
        Assert.assertEquals(_builder_1.toString(), it.getGeneratedCode("entities.FirstEntity"));
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("package entities;");
        _builder_2.newLine();
        _builder_2.newLine();
        _builder_2.append("public class SecondEntity {");
        _builder_2.newLine();
        _builder_2.newLine();
        _builder_2.append("}");
        _builder_2.newLine();
        Assert.assertEquals(_builder_2.toString(), it.getGeneratedCode("entities.SecondEntity"));
      };
      this._compilationTestHelper.compile(_builder, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testGeneratedJavaCodeWithTwoClasses() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("entity FirstEntity {");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("SecondEntity myAttribute;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("entity SecondEntity {");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("string s;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final IAcceptor<CompilationTestHelper.Result> _function = (CompilationTestHelper.Result it) -> {
        try {
          final Object FirstEntity = it.getCompiledClass("entities.FirstEntity").newInstance();
          final Object SecondEntity = it.getCompiledClass("entities.SecondEntity").newInstance();
          this._reflectExtensions.invoke(SecondEntity, "setS", "testvalue");
          this._reflectExtensions.invoke(FirstEntity, "setMyAttribute", SecondEntity);
          Assert.assertSame(SecondEntity, this._reflectExtensions.invoke(FirstEntity, "getMyAttribute"));
          Assert.assertEquals("testvalue", this._reflectExtensions.invoke(this._reflectExtensions.invoke(FirstEntity, "getMyAttribute"), "getS"));
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      };
      this._compilationTestHelper.compile(_builder, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test(expected = IllegalStateException.class)
  public void testInputWithValidationError() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("entity MyEntity {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("// missing ;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("string myAttribute");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final IAcceptor<CompilationTestHelper.Result> _function = (CompilationTestHelper.Result it) -> {
        final Function1<Issue, Boolean> _function_1 = (Issue it_1) -> {
          Severity _severity = it_1.getSeverity();
          return Boolean.valueOf(Objects.equal(_severity, Severity.ERROR));
        };
        final Iterable<Issue> allErrors = IterableExtensions.<Issue>filter(it.getErrorsAndWarnings(), _function_1);
        boolean _isEmpty = IterableExtensions.isEmpty(allErrors);
        boolean _not = (!_isEmpty);
        if (_not) {
          final Function1<Issue, String> _function_2 = (Issue it_1) -> {
            return it_1.toString();
          };
          String _join = IterableExtensions.join(IterableExtensions.<Issue, String>map(allErrors, _function_2), ", ");
          String _plus = ("One or more resources contained errors : " + _join);
          throw new IllegalStateException(_plus);
        }
      };
      this._compilationTestHelper.compile(_builder, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
