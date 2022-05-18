import {Mjesto} from "./mjesto";
import {Izvodac} from "./izvodac";
import {Menadzer} from "./menadzer";

export interface Dogadaj {
  id: number;
  naziv: string;
  trajanjeDani: number;
  brojUlaznica: number;
  datumPocetka: any;
  mjesto: Mjesto;
  izvodaci: Izvodac;
  organizatori: Menadzer;
}
