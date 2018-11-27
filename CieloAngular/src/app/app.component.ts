import { Component, OnInit  } from '@angular/core';
import { LancamentoService } from './lancamento.service';
import { Lancamento } from './Lancamento';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'Cielo';
  text = [];

  constructor(private LancamentoService: LancamentoService){}

   ngOnInit() {
    this.getLancamentos();
  }


  getLancamentos(): void {
  	this.LancamentoService.getLancamentos().subscribe(
  		text => {this.text = text;console.log(text)});
  }


}
