import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Dogadaj} from "../../model/dogadaj";

@Injectable({
  providedIn: 'root'
})
export class DogadajService {

  baseUrl = 'api/v1/dogadaj';

  constructor(private http: HttpClient) { }

  findAll(): Observable<Dogadaj[]>{
    return this.http.get<Dogadaj[]>(this.baseUrl + '/all');
  }

  findById(id: string): Observable<Dogadaj>{
    return this.http.get<Dogadaj>(this.baseUrl + '/' + id);
  }

  addDogadaj(dogadaj: Dogadaj){
    return this.http.post(this.baseUrl, dogadaj);
  }

  deleteDogadaj(id: number){
    return this.http.delete(this.baseUrl + '/' + id);
  }

  updateDogadaj(dogadaj: Dogadaj){
    return this.http.put(this.baseUrl, dogadaj);
  }
}
