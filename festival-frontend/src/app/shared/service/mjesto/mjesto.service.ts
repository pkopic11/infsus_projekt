import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Mjesto} from "../../model/mjesto";

@Injectable({
  providedIn: 'root'
})
export class MjestoService {
  baseUrl = '/api/v1/mjesto';

  constructor(private http: HttpClient) { }

  findAll(): Observable<Mjesto[]>{
    return this.http.get<Mjesto[]>(this.baseUrl + '/all');
  }
}
