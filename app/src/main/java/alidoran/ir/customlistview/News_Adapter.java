package alidoran.ir.customlistview;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class News_Adapter extends ArrayAdapter {
    public int resourceId;
    public Activity activity;
    public ArrayList < news > data;

    public News_Adapter ( Activity activity, int resourceId, ArrayList<news> object){
        super ( activity,resourceId,object );

        this.resourceId=resourceId;
        this.activity=activity;
        this.data=object;


    }

    @NonNull
    @Override
    public View getView ( int position , @Nullable View convertView , @NonNull ViewGroup parent ) {
        View view=convertView;
        view=this.activity.getLayoutInflater ().inflate ( this.resourceId,null );

        ImageView imgenews=(ImageView)view.findViewById ( R.id.Img );
        TextView textTitle=view.findViewById ( R.id.txtcnews );

        news neww=data.get ( position );
        imgenews.setImageResource ( R.drawable.img );
        textTitle.setText ( neww.titleNews );

        return view;

    }
}
