import { PetType } from "./pet-type";
import { Visit } from "./visit";
import { Owner } from "./owner";

export interface Pets {
    id:number,
    name:string,
    birthDate:Date,
    type:PetType,
    typeName?:string,
    owner:Owner,
    visits?:Visit[],
}
