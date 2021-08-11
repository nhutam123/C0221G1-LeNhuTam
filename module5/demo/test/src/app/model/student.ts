import {Teacher} from './teacher';

export interface Student {
  id ?: number;
  name ?: string;
  dateOfBirth ?: string;
  teacher?: Teacher;
}
