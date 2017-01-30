package sikder.nehan.uvabucketlist;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import java.util.List;

/**
 * Created by nehan on 1/29/17.
 */

public class BucketListAdapter extends
        RecyclerView.Adapter<BucketListAdapter.ViewHolder>  {

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private CheckBox mCheckBox;
        public ViewHolder(View itemView) {
            super(itemView);
            mCheckBox = (CheckBox) itemView.findViewById(R.id.check);
        }

    }

    private List<BucketItem> mItems;
    private Context mContext;

    public BucketListAdapter(Context context, List<BucketItem> items){
        mItems = items;
        mContext = context;
    }

    private Context getContext() {
        return mContext;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View itemtView = inflater.inflate(R.layout.item, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(itemtView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(BucketListAdapter.ViewHolder holder, int position) {
        BucketItem item = mItems.get(position);
        // Set item views based on your views and data model
        CheckBox check = holder.mCheckBox;
        check.setText(item.getName());

    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }
}
