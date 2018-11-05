package com.example.madhav.try1;
import android.content.Context;
import android.widget.Toast;
import android.util.Log;
import android.util.Log;
import android.util.Log;
//Do not Edit the below comment as Augrat use it as Index to Call BugBLocks
//<<!@AUGRAT Class Index@!>>
public class Augrat {

    public static void init(Context context)
    {
        initiatingToast(context);
        //Do not Edit the below comment as Augrat use it as index to place BugBLocks methods calls
        //<<!@AUGRAT Constructor Index@!>>
          divideByZero();
          nullPointerException();
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
  public static void divideByZero() {
  int num1 = 15;
  int num2 = 0;
  int result = 0;
  result = num1 / num2;
  Log.d("Output", "Result: " + Integer.toString(result));
  }


  public static void nullPointerException() {
  String ptr = null;
  if (ptr.equals("npe"))
  Log.d("Output ", "Equal");
  else
  Log.d("Output ", "Not Equal");
  }


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
