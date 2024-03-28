import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import android.widget.TextView
import com.example.hippocentre.ui.cursus.CursusItem

// SimpleExpandableListAdapter.kt
class SimpleExpandableListAdapter(
    private val context: Context,
    private val cursusList: List<CursusItem>
) : BaseExpandableListAdapter() {

    override fun getGroupCount(): Int = cursusList.size
    override fun getChildrenCount(groupPosition: Int): Int = cursusList[groupPosition].children.size
    override fun getGroup(groupPosition: Int): Any = cursusList[groupPosition]
    override fun getChild(groupPosition: Int, childPosition: Int): Any = cursusList[groupPosition].children[childPosition]
    override fun getGroupId(groupPosition: Int): Long = groupPosition.toLong()
    override fun getChildId(groupPosition: Int, childPosition: Int): Long = childPosition.toLong()
    override fun hasStableIds(): Boolean = true
    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean = true

    override fun getGroupView(groupPosition: Int, isExpanded: Boolean, convertView: View?, parent: ViewGroup?): View {
        val groupTitle = getGroup(groupPosition) as CursusItem
        val textView = convertView as TextView? ?: LayoutInflater.from(context).inflate(android.R.layout.simple_expandable_list_item_1, parent, false) as TextView
        textView.text = groupTitle.title
        return textView
    }

    override fun getChildView(groupPosition: Int, childPosition: Int, isLastChild: Boolean, convertView: View?, parent: ViewGroup?): View {
        val childText = getChild(groupPosition, childPosition) as String
        val textView = convertView as TextView? ?: LayoutInflater.from(context).inflate(android.R.layout.simple_expandable_list_item_2, parent, false) as TextView
        textView.text = childText
        return textView
    }

}
