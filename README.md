# Landscape Portrait Switch Android Screen
1. First create a folder/package name layout-land in Project >> app >> main >> res >> layout-land
2. create an xml file as name same. for example activity_main.xml
3. create an Edittext in layout >> activity_main.xml and given an ID. Example: android:id="@+id/et_test"
4. create an Edittext in layout-land >> activity_main.xml and given same ID - (android:id="@+id/et_test")
5. In onCreate method initialized Edittext as global. Ex:  editTextTest = (EditText)findViewById(R.id.et_test);
6. Write given code in onSaveInstanceState Method - 
  savedInstanceState.putString("arg1", editTextTest.getText().toString());
  
7. Write given code in onRestoreInstanceState Method - 
   editTextTest.setText(savedInstanceState.getString("arg1"));
   
8. Run the project. 

### Portrait View Looks Like

![portrait](https://cloud.githubusercontent.com/assets/10769565/20864594/df8c936e-ba21-11e6-9a9f-e9b25f762f7e.PNG)

### Landscape View Looks Like
![landscape](https://cloud.githubusercontent.com/assets/10769565/20864602/142bf722-ba22-11e6-969c-41eb70cd588c.PNG)


# Enjoy the code
