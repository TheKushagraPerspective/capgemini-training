import { Routes } from '@angular/router';
import { Home } from '../core/home/home';
import { Electronics } from '../core/electronics/electronics';
import { Product } from '../core/product/product';
import { About } from '../core/about/about';
import { PageNotFound } from '../core/page-not-found/page-not-found';
import { Pageinfo } from '../core/home-child/pageinfo/pageinfo';
import { Profile } from '../core/home-child/profile/profile';
import { Feedback } from '../core/home-child/feedback/feedback';

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