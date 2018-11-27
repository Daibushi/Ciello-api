import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { catchError, map, tap } from 'rxjs/operators';
import { Lancamento } from './Lancamento';

@Injectable({
  providedIn: 'root'
})
export class LancamentoService {

  lanc: any;
  constructor( private http: HttpClient) { }

  private apiUrl = 'http://localhost:8080/lancamento';

  getLancamentos (): Observable<Lancamento[]>  {
  	return this.http.get<Lancamento[]>(this.apiUrl);;
	}
}
