package asdads.comaasd.com;
import android.content.Context;
import android.widget.Toast;
import android.util.Log;
//Do not Edit the below comment as Augrat use it as Index to Call BugBLocks
//<<!@AUGRAT Class Index@!>>
public class Augrat {

    public static void init(Context context)
    {
        initiatingToast(context);
        //Do not Edit the below comment as Augrat use it as index to place BugBLocks methods calls
        //<<!@AUGRAT Constructor Index@!>>
          stackOverflowError();
    }

    public static void compileTest(Context context)
    {
        Toast.makeText(context.getApplicationContext(),"Augrat successfully compiled!", Toast.LENGTH_LONG).show();
    }

    public static void initiatingToast(Context context)
    {
        Toast.makeText(context.getApplicationContext(),"Starting AUGRAT!", Toast.LENGTH_LONG).show();
    }

    //Do not edit the below comment as Augrat use it as index to place BugBLocks methods
    //<<!@AUGRAT Method Index@!>>
   public static void recursivePrint(int num) {
  Log.d("Output ", "Number: " + num);
  if (num == 0)
  return;
  else
  recursivePrint(++num);
  }
  public static void stackOverflowError() {
  recursivePrint(1);
  }



}
