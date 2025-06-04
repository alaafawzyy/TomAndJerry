package com.example.tomandjerry.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.components.TopBar
import com.example.tomandjerry.ui.components.StoreHeader
import com.example.tomandjerry.ui.components.StoreSearchBar
import com.example.tomandjerry.ui.components.StorePromoCard
import com.example.tomandjerry.ui.components.TomItemsGrid
import com.example.tomandjerry.ui.theme.BackGround


@Composable
fun StoreScreen() {
    Scaffold (
        modifier = Modifier
            .fillMaxSize()
            .background(BackGround)
            .padding(horizontal = 16.dp, vertical = 42.dp),

        topBar = { TopBar(
            profileImage = R.drawable.jerry,
            title = stringResource(R.string.hi_jerry),
            subtitle = stringResource(R.string.which_tom_do_you_want_to_buy)
        )
        }
    ){ padding->
            StoreScreenContent(padding=padding)
    }
}


@Composable
private fun StoreScreenContent(padding: PaddingValues) {
    Column(
        modifier = Modifier.padding(top = padding.calculateTopPadding()).background(BackGround)
    ) {
        StoreSearchBar()
        StorePromoCard()
        StoreHeader(title = "Cheap tom Section")
        TomItemsGrid()
    }
}


@Preview(showBackground = true, showSystemUi = true,
    device = "spec:width=1280dp,height=800dp,dpi=240"
)
@Composable
fun StoreScreenPreview(){
    StoreScreen()
}