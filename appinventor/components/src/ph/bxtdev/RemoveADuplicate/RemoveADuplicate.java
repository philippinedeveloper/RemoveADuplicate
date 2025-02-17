package ph.bxtdev.RemoveADuplicate;

import android.app.Activity;
import android.content.Context;
import com.google.appinventor.components.annotations.*;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.YailList;  
import java.util.List;  
import java.util.ArrayList;  

@DesignerComponent(
        version = 1,
        description = "Removes a duplicate from a list",
        category = ComponentCategory.EXTENSION,
        nonVisible = true,
        iconName = "")

@SimpleObject(external = true)
//Libraries
@UsesLibraries(libraries = "")
//Permissions
@UsesPermissions(permissionNames = "")

public class RemoveADuplicate extends AndroidNonvisibleComponent {

    //Activity and Context
    private Context context;
    private Activity activity;

    public RemoveADuplicate(ComponentContainer container){
        super(container.$form());
        this.activity = container.$context();
        this.context = container.$context();
    }

    @SimpleFunction
    public YailList RemoveDuplicates(YailList inputList, YailList outputList){
            List<Object> input = new ArrayList<>();
            List<Object> output = new ArrayList<>();
            Object[] inputArray = inputList.toArray();
            for (Object item : inputArray) {
                input.add(item); 
            }

            // Iterate through input list and remove duplicates
            for (Object item : input) {
                 if(!output.contains(item)){
                    output.add(item); 
                 }
            }
            
            return YailList.makeList(output); 
    }
}

