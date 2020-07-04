## Databinding 

The application covers general areas on databinding by showcasing databinding in recycler view
adapter,in activities and using a simple case of a binding adapter.

```
Databinding lets you bind UI components in your layouts to data sources in your app using a 
declarative format rather than programmatically.
```         

What this means is you simply tell your layouts the data it will be handling and which view will show
what aspect of the data as compared to using ```findViewById()``` and setting the data to each view
in code.

### Screenshots

<img src="art/1.png" width="200"/> <img src="art/2.png" width="200"/>


With dataBinding you don't need to make use of 
```textView = findViewById(R.id.tvMyID)```
Instead you just have to do a direct castout from your layout in the textview as
```android:text"@{className.propertyValue}"```

to make sure android studio know you are using dataBinding, you have to set it on your gradle file
```
 dataBinding {
        enabled = true
    }
```

for android studio 4+ you can use
```
  buildFeatures {
          dataBinding true
    }
```

### Reference

- [DataBinding](https://developer.android.com/topic/libraries/data-binding)



