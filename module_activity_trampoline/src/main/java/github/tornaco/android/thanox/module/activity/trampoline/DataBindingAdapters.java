package github.tornaco.android.thanox.module.activity.trampoline;

import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import github.tornaco.java.common.util.Consumer;

public class DataBindingAdapters {

    @SuppressWarnings({"unchecked", "ConstantConditions"})
    @BindingAdapter("android:replacements")
    public static void setReplacements(RecyclerView view, List<ActivityTrampolineModel> models) {
        Consumer<List<ActivityTrampolineModel>> consumer = (Consumer<List<ActivityTrampolineModel>>) view.getAdapter();
        consumer.accept(models);
    }
}
