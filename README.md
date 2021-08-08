# NumberOfItem

详细内容博客地址:[自定义View-NumberOfItem](http://www.fanandjiu.com/article/a0ebeec7.html)

简介：
描述一个物品以及其数量的控件

运行效果：
<img src="https://android-1300729795.cos.ap-chengdu.myqcloud.com/project/Self_View/NumberOfItem/number_of_item.jpg" style="zoom: 33%;" />

#### 1. 添加依赖

Add it in your root build.gradle at the end of repositories:
~~~
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
~~~
Step 2. Add the dependency
~~~
dependencies {
	  implementation 'com.github.xiaoshitounen:NumberOfItem:1.0.2'
}
~~~

#### 2. Xml文件中静态使用

~~~xml
<swu.xl.numberofitem.NumberOfItem
   android:id="@+id/number_item"
   android:layout_width="55dp"
   android:layout_height="55dp"
   />
~~~

**① 属性**
show_img：显示物品图片的控件。
srcResource：物品图片资源的id。
imgResource：物品图片控件的背景样式资源id。
show_count：显示物品数量的控件。
countResource：物品数量控件的背景样式资源id。
count：记录物品的数量。
paint：绘制数量的画笔。

**② 设置数量**
~~~java
NumberOfItem item = findViewById(R.id.number_item);
        
item.setCount(10);
~~~

**③ 物品图片控件的背景样式例子**
~~~xml
<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android"
    android:shape="rectangle">

    <!--设置圆角-->
    <corners android:radius="18dp"/>

    <!--设置填充颜色-->
    <solid android:color="#67C1D1"/>

    <!--设置内间距-->
    <padding android:left="5dp"
        android:top="5dp"
        android:right="5dp"
        android:bottom="5dp"
        />

</shape>
~~~


**④ 物品数量控件的背景样式例子**
~~~xml
<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android"
    android:shape="oval">

    <!--设置填充颜色-->
    <solid android:color="#EB5476"/>

    <!--设置大小-->
    <size android:width="20dp"
        android:height="20dp"
        />

</shape>
~~~
