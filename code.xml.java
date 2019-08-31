<?xml version="1.0" encoding="utf-8"?>
<LinearLayout android:layout_width="368dp"
    android:layout_height="495dp"
    xmlns:tools="http://schemas.android.com/tools"
    android:orientation="horizontal"
    tools:layout_editor_absoluteX="8dp"
    tools:layout_editor_absoluteY="8dp"
    android:weightSum="1"
    xmlns:android="http://schemas.android.com/apk/res/android">
    <RelativeLayout
        android:layout_width="390dp"
        android:layout_height="509dp">
        <TextView
            android:id="@+id/textView4"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignParentLeft="true"
            android:layout_alignParentStart="true"
            android:layout_alignParentTop="true"
            android:layout_marginLeft="13dp"
            android:layout_marginStart="13dp"
            android:layout_marginTop="104dp"
            android:text="Enter Name:"
            android:textColor="@android:color/black"
            android:textSize="24sp" />
        <EditText
            android:id="@+id/editText4"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginLeft="11dp"
            android:ems="10"
            android:inputType="textPersonName"
            android:text="Name"
            android:layout_alignBaseline="@+id/textView4"
            android:layout_alignBottom="@+id/textView4"
            android:layout_toRightOf="@+id/textView4"
            android:layout_toEndOf="@+id/textView4"
            android:layout_marginStart="11dp" />
	<TextView
            android:id="@+id/textView4"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignParentLeft="true"
            android:layout_alignParentStart="true"
            android:layout_alignParentTop="true"
            android:layout_marginLeft="13dp"
            android:layout_marginStart="13dp"
            android:layout_marginTop="104dp"
            android:text="Enter Email id:"
            android:textColor="@android:color/black"
            android:textSize="24sp" />
        <EditText
            android:id="@+id/editText6"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginLeft="11dp"
            android:ems="10"
            android:inputType="textPerson email"
            android:text="email"
            android:layout_alignBaseline="@+id/textView6"
            android:layout_alignBottom="@+id/textView6"
            android:layout_toRightOf="@+id/textView6"
            android:layout_toEndOf="@+id/textView6"
            android:layout_marginStart="11dp" />
        <Button
            android:id="@+id/button3"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignEnd="@+id/editText4"
            android:layout_alignRight="@+id/editText4"
            android:layout_below="@+id/editText4"
            android:layout_marginEnd="41dp"
            android:layout_marginRight="41dp"
            android:layout_marginTop="46dp"
            android:onClick="ShowMessage()"
            android:text="Get Service" />
        <TextView
            android:id="@+id/textView5"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignLeft="@+id/editText4"
            android:layout_alignStart="@+id/editText4"
            android:layout_below="@+id/button3"
            android:layout_marginTop="56dp"
            android:textColor="@android:color/black"
            android:textSize="24sp" />
    </RelativeLayout>
</LinearLayout>