import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

class CustomSizeValidator implements ConstraintValidator<CustomSize, String> {

   @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
      try { 
        
          if(value.length()==5 || value.length()==10){
              return true;
             }else{
               return false;
             }
        } catch (Exception e) {
         return false;
      }
   }
}