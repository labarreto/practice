public void deepNode() {
            if (isEmpty())
                return;
 
            Queue q = new Queue();
            // add root to the queue
            q.enqueue(root);


            // while the queue is not empty
            while (! q.isEmpty())
            {   // set current BTNode to equal the item in the queue, while also
                // removing the item from the queue. 
                BTNode current = (BTNode) (q.dequeue());
 
                if (current!=null)
                    // if current is not null, so while it has children, 
                {
                    if (current.left!=null)
                        q.enqueue(current.left);
                    if (current.right!=null)
                        q.enqueue(current.right);
                    if (current.right==null && current.left==null)
                        System.out.println(current.item);
                }
            }
        }

// you have a tree t
// so then you would call t.deepNode() to return deepest node of the tree. 