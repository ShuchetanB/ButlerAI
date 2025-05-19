
package com.butlerai

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class PermissionsActivity : AppCompatActivity() {

    private val pendingPermissions = listOf(
        "Add module: world_history",
        "Allow internet access to example.org",
        "Enable summarization module",
        "Install skill: logic_analysis"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_permissions)

        val permissionsList = findViewById<ListView>(R.id.permissionsList)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_multiple_choice, pendingPermissions)
        permissionsList.adapter = adapter
        permissionsList.choiceMode = ListView.CHOICE_MODE_MULTIPLE

        val approveButton = findViewById<Button>(R.id.approveButton)
        approveButton.setOnClickListener {
            val approved = mutableListOf<String>()
            for (i in 0 until permissionsList.count) {
                if (permissionsList.isItemChecked(i)) {
                    approved.add(pendingPermissions[i])
                }
            }
            Toast.makeText(this, "Approved: " + approved.joinToString(), Toast.LENGTH_LONG).show()
        }
    }
}
