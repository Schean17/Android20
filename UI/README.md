# Android布局实验



## 线性布局实现

![image-20200329160833820](C:\Users\ikutarian\AppData\Roaming\Typora\typora-user-images\image-20200329160833820.png)



activity_main.xml

```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:showDividers="middle"
    android:divider="@color/dividerpad"
    android:background="@android:color/black"
    android:orientation="vertical" >

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_gravity="fill_horizontal"
        android:showDividers="middle"
        android:divider="@color/dividerpad"
        android:orientation="horizontal">
        <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_margin="5dp"
        android:textColor="@color/dividerpad"
        android:id="@+id/oneone"
        android:text="@string/oneone"
        android:layout_weight="1"
        android:background="@drawable/border"/>

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_margin="5dp"
            android:textColor="@color/dividerpad"
            android:id="@+id/onetwo"
            android:text="@string/onetwo"
            android:layout_weight="1"
            android:background="@drawable/border"/>

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_margin="5dp"
            android:textColor="@color/dividerpad"
            android:id="@+id/onethree"
            android:text="@string/onethree"
            android:layout_weight="1"
            android:background="@drawable/border"/>

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_margin="5dp"
            android:textColor="@color/dividerpad"
            android:id="@+id/onefour"
            android:text="@string/onefour"
            android:layout_weight="1"
            android:background="@drawable/border"/>
    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_gravity="fill_horizontal"
        android:showDividers="middle"
        android:divider="@color/dividerpad"
        android:orientation="horizontal">
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_margin="5dp"
            android:textColor="@color/dividerpad"
            android:id="@+id/twoone"
            android:text="@string/twoone"
            android:layout_weight="1"
            android:background="@drawable/border"/>

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_margin="5dp"
            android:textColor="@color/dividerpad"
            android:id="@+id/twotwo"
            android:text="@string/twotwo"
            android:layout_weight="1"
            android:background="@drawable/border"/>

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_margin="5dp"
            android:textColor="@color/dividerpad"
            android:id="@+id/twothree"
            android:text="@string/twothree"
            android:layout_weight="1"
            android:background="@drawable/border"/>

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_margin="5dp"
            android:textColor="@color/dividerpad"
            android:id="@+id/twofour"
            android:text="@string/twofour"
            android:layout_weight="1"
            android:background="@drawable/border"/>
    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_gravity="fill_horizontal"
        android:showDividers="middle"
        android:divider="@color/dividerpad"
        android:orientation="horizontal">
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_margin="5dp"
            android:textColor="@color/dividerpad"
            android:id="@+id/threeone"
            android:text="@string/threeone"
            android:layout_weight="1"
            android:background="@drawable/border"/>

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_margin="5dp"
            android:textColor="@color/dividerpad"
            android:id="@+id/threetwo"
            android:text="@string/threetwo"
            android:layout_weight="1"
            android:background="@drawable/border"/>

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_margin="5dp"
            android:textColor="@color/dividerpad"
            android:id="@+id/threethree"
            android:text="@string/threethree"
            android:layout_weight="1"
            android:background="@drawable/border"/>

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_margin="5dp"
            android:textColor="@color/dividerpad"
            android:id="@+id/threefour"
            android:text="@string/onefour"
            android:layout_weight="1"
            android:background="@drawable/border"/>
    </LinearLayout>
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_gravity="fill_horizontal"
        android:showDividers="middle"
        android:divider="@color/dividerpad"
        android:orientation="horizontal">
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_margin="5dp"
            android:textColor="@color/dividerpad"
            android:id="@+id/fourone"
            android:text="@string/fourone"
            android:layout_weight="1"
            android:background="@drawable/border"/>

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_margin="5dp"
            android:textColor="@color/dividerpad"
            android:id="@+id/fourtwo"
            android:text="@string/fourtwo"
            android:layout_weight="1"
            android:background="@drawable/border"/>

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_margin="5dp"
            android:textColor="@color/dividerpad"
            android:id="@+id/fourthree"
            android:text="@string/fourthree"
            android:layout_weight="1"
            android:background="@drawable/border"/>

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_margin="5dp"
            android:textColor="@color/dividerpad"
            android:id="@+id/fourfour"
            android:text="@string/fourfour"
            android:layout_weight="1"
            android:background="@drawable/border"/>
    </LinearLayout>
</LinearLayout>
```





```
res/string.xml
<resources>
    <string name="app_name">My Application</string>
    <string name="oneone">One,One</string>
    <string name="onetwo">One,Two</string>
    <string name="onethree">One,Three</string>
    <string name="onefour">One,Four</string>
    <string name="twoone">Two,One</string>
    <string name="twotwo">Two,Two</string>
    <string name="twothree">Two,Three</string>
    <string name="twofour">Two,Four</string>
    <string name="threeone">Three,One</string>
    <string name="threetwo">Three,Two</string>
    <string name="threethree">Three,Three</string>
    <string name="threefour">Three,Four</string>
    <string name="fourone">Four,One</string>
    <string name="fourtwo">Four,Two</string>
    <string name="fourthree">Four,Three</string>
    <string name="fourfour">Four,Four</string>
</resources>

```

![image-20200329183915261](C:\Users\ikutarian\AppData\Roaming\Typora\typora-user-images\image-20200329183915261.png)

## ConstraintLayout  布局

![image-20200329183928184](C:\Users\ikutarian\AppData\Roaming\Typora\typora-user-images\image-20200329183928184.png)

==在manifest.xml中的activity里加上【android:screenOrientation="landscape"】设置横屏布局==

android:gravity="center"实现文字居中显示；android:layout_toStartOf设置

android:layout_alignParentTop="true" 将此视图的上边缘与父视图的上边缘对齐。

activity_main.xml

```

<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent" android:layout_height="match_parent"
    android:background="@android:color/black"
    >

    <TextView
        android:id="@+id/red"
        android:layout_width="80dp"
        android:layout_height="80dp"
        android:textSize="15sp"
        android:gravity="center"
        android:text="RED"
        android:layout_alignParentStart="true"
        android:layout_alignParentTop="true"
        android:background="#FF0000"
        />

    <TextView
        android:id="@+id/orange"
        android:layout_width="80dp"
        android:layout_height="80dp"
        android:layout_alignParentTop="true"
        android:layout_centerHorizontal="true"
        android:background="#FFB90F"
        android:gravity="center"
        android:text="ORANGE"
        android:textSize="15sp" />

    <TextView
        android:id="@+id/yellow"
        android:layout_width="80dp"
        android:layout_height="80dp"
        android:layout_alignParentEnd="true"
        android:layout_alignParentTop="true"
        android:background="#FFFF00"
        android:gravity="center"
        android:text="YELLOW"
        android:textSize="15sp" />

    <TextView
        android:layout_width="80dp"
        android:layout_height="80dp"
        android:layout_alignTop="@+id/BLUE"
        android:layout_marginEnd="32dp"
        android:layout_toStartOf="@+id/BLUE"
        android:background="#00FF00"
        android:gravity="center"
        android:text="GREEN"
        android:id="@+id/green" />

    <TextView
        android:id="@+id/BLUE"
        android:layout_width="80dp"
        android:layout_height="80dp"
        android:layout_alignStart="@+id/orange"
        android:layout_below="@+id/orange"
        android:layout_marginTop="100dp"
        android:background="#0000FF"
        android:gravity="center"
        android:text="BLUE"
        android:textColor="#FFFFFF" />

    <TextView
        android:id="@+id/indigo"
        android:layout_width="80dp"
        android:layout_height="80dp"
        android:textColor="#FFFFFF"
        android:layout_alignTop="@+id/BLUE"
        android:layout_marginStart="34dp"
        android:layout_toEndOf="@+id/BLUE"
        android:background="#4B0082"
        android:gravity="center"
        android:text="INDIGO" />

    <TextView
        android:layout_width="match_parent"
        android:layout_height="40dp"
        android:layout_alignParentStart="true"
        android:layout_below="@+id/BLUE"
        android:layout_marginTop="81dp"
        android:background="#EF85EF"
        android:gravity="center"
        android:text="VIOLET" />

</RelativeLayout>
```

AndroidManifest.xml

> ```
> <?xml version="1.0" encoding="utf-8"?>
> <manifest xmlns:android="http://schemas.android.com/apk/res/android"
>     package="edu.fjnu.constract">
> 
>     <application
>         android:allowBackup="true"
>         android:icon="@mipmap/ic_launcher"
>         android:label="@string/app_name"
>         android:roundIcon="@mipmap/ic_launcher_round"
>         android:supportsRtl="true"
>         android:theme="@style/AppTheme">
>         <activity android:name=".MainActivity"
>             android:screenOrientation="landscape">
>             <!--设置横屏-->
>             <intent-filter>
>                 <action android:name="android.intent.action.MAIN" />
> 
>                 <category android:name="android.intent.category.LAUNCHER" />
>             </intent-filter>
>         </activity>
> 
>     </application>
> 
> </manifest>
> ```

![image-20200329171829402](C:\Users\ikutarian\AppData\Roaming\Typora\typora-user-images\image-20200329171829402.png)



## 表格布局

![image-20200329183947668](C:\Users\ikutarian\AppData\Roaming\Typora\typora-user-images\image-20200329183947668.png)

android:gravity="left"设置左对齐

 android:gravity="right"设置右对齐

用视图画出分割线

```
<?xml version="1.0" encoding="utf-8"?>
<TableLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent" android:layout_height="match_parent"
    android:background="#000000"
    android:stretchColumns="*">

    <TableRow android:layout_height="60dp"
        >

        <TextView
            android:layout_height="match_parent"
            android:textSize="14sp"
            android:text="   Open..."
            android:gravity="left"
            android:textColor="#FFFFFF" />

        <TextView
            android:layout_height="match_parent"
            android:text="Ctrl-O"
            android:textSize="14sp"
            android:gravity="right"
            android:textColor="#FFFFFF" />

    </TableRow>
    <TableRow android:layout_height="60dp"
        >

        <TextView
            android:layout_height="match_parent"
            android:textSize="14sp"
            android:text="   Save..."
            android:gravity="left"
            android:textColor="#FFFFFF" />

        <TextView
            android:layout_height="match_parent"
            android:text="Ctrl-S"
            android:textSize="14sp"
            android:gravity="right"
            android:textColor="#FFFFFF" />

    </TableRow>
    <TableRow android:layout_height="60dp"
        >

        <TextView
            android:layout_height="match_parent"
            android:textSize="14sp"
            android:text="   Save As..."
            android:gravity="left"
            android:textColor="#FFFFFF" />

        <TextView
            android:layout_height="match_parent"
            android:text="Ctrl-Shift-S"
            android:textSize="14sp"
            android:gravity="right"
            android:textColor="#FFFFFF" />

    </TableRow>

  

    <View  android:layout_height="2px"
        android:layout_width="match_parent"
        android:background="#FFFFFF"
        />
    <TableRow android:layout_height="60dp"
        >

        <TextView
            android:layout_height="match_parent"
            android:textSize="14sp"
            android:text="X Import..."
            android:gravity="left"
            android:textColor="#FFFFFF" />

        <TextView
            android:layout_height="match_parent"
            android:text="Ctrl-I"
            android:textSize="14sp"
            android:gravity="right"
            android:textColor="#FFFFFF" />

    </TableRow>
    <TableRow android:layout_height="60dp"
        >

        <TextView
            android:layout_height="match_parent"
            android:textSize="14sp"
            android:text="X Export..."
            android:gravity="left"
            android:textColor="#FFFFFF" />

        <TextView
            android:layout_height="match_parent"
            android:text="Ctrl-E"
            android:textSize="14sp"
            android:gravity="right"
            android:textColor="#FFFFFF" />

    </TableRow>

    <View  android:layout_height="2px"
        android:layout_width="match_parent"
        android:background="#FFFFFF"
        />
    <TableRow android:layout_height="60dp"
        >

        <TextView
            android:layout_height="match_parent"
            android:textSize="14sp"
            android:text="   Quit..."
            android:gravity="left"
            android:textColor="#FFFFFF" />

        <TextView
            android:layout_height="match_parent"
            android:text="Ctrl-Q"
            android:textSize="14sp"
            android:gravity="right"
            android:textColor="#FFFFFF" />

    </TableRow>



</TableLayout>
```

![image-20200329165856883](C:\Users\ikutarian\AppData\Roaming\Typora\typora-user-images\image-20200329165856883.png)