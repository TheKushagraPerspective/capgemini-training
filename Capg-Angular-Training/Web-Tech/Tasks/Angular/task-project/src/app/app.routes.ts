import { Routes } from '@angular/router';
import { Home } from './components/home/home';
import { Pageinfo } from './components/home-child/pageinfo/pageinfo';
import { Profile } from './components/home-child/profile/profile';
import { Feedback } from './components/home-child/feedback/feedback';
import { Product } from './components/product/product';
import { Electronics } from './components/electronics/electronics';
import { About } from './components/about/about';
import { PageNotFound } from './components/page-not-found/page-not-found';

export const routes: Routes = [
    {path:"", component:Home , children:[
        {path:"pageInfo" , component:Pageinfo},
        {path:"profile" , component:Profile},
        {path:"feedback" , component:Feedback},
    ]},
    {path:"product", component:Product},
    {path:"elec", component:Electronics},
    {path:"about", component:About},
    {path:"**", component:PageNotFound},
]
