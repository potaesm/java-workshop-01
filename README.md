# workshop-java-01

## Circular buffer

### 1. Data structure ? (Internal)
+ Array of String

### 2. Operations/Behavior/Methods ?  user -> CB ?
+ writeData(string):void
+ readData(): string
+ isFull(): boolean
+ isEmpty(): boolean

+ setSize(int): void

### 3. Internal process ?
+ buffer size = 10 (default)
+ read pointer = 0
+ write pointer = 0

### List of test cases
* TC01 => write_A_to_buffer_one_time_should_read_A_at_eleventh_time
* TC02 => write_A_one_time_should_not_empty
* TC03 => write_1_to_10_then_read_first_time_and_eleventh_time_should_be_same
* TC04 => set_buffer_size_to_11_when_write_A_10_times_should_not_full
* TC05 => read_without_write_before_should_return_null

## Refactor
* Point ค่าหนึ่งจะได้ Result ที่เหมือนเดิม ไม่ว่าจะเป็น Player ใด สามารถประกาศค่าคงที่ในรูปแบบ Array มาใช้แทนได้ เช่น arr[0] = "Love", arr[1] = "Fifteen"
* มีเงื่อนไขที่ทำงานลักษณะเดียวกัน แต่ต่าง Player และบางเงื่อนไขเป็นส่วนหนึ่งของอีกเงื่อนไข สามารถยุบได้