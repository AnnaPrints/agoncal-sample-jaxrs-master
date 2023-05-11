package org.agoncal.sample.jaxrs.jwt.filter;

import javax.ws.rs.NameBinding;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@NameBinding
@Retention(RUNTIME)
@Target({TYPE, METHOD})
public @interface JWTTokenNeeded {
}

class A{}
class B extends A
{
 A myA = new A();
 A myA1 = new A();
}

class B1 extends A{}
/*class B2 extends A{}
class B3 extends A{}
class B4 extends A{}
class B5 extends A{}*/
