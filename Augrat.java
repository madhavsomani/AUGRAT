package com.example.madhav.try1;
import android.content.Context;
import android.widget.Toast;
import android.util.Log;
//Do not Edit the below comment as Augrat use it as Index to Call BugBLocks
//<<!@AUGRAT Class Index@!>>

public class Augrat {

    public void init(Context context)
    {
        initiatingToast(context);
        Thread thread = new Thread(){
           @Override
           public void run() {
               try {
                   Thread.sleep(Toast.LENGTH_LONG); // As I am using LENGTH_LONG in Toast
                   //Do not Edit the below comment as Augrat use it as index to place BugBLocks methods calls
                   //<<!@AUGRAT Constructor Index@!>>
  stackOverflowError();

               } catch (Exception e) {
                   e.printStackTrace();
               }
           }
       };
       thread.start();
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
